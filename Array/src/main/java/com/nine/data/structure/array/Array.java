package com.nine.data.structure.array;

/**
 * @desc 自定义数组
 * @author 月在未央
 * @date 2019/8/4 10:32
 **/
public class Array {
    private int[] data;
    private int size;

    /**
     *  构造方法，传入数组的容量初始化数组
     * @param capacity 容量
     */
    public Array(int capacity){
        data = new int[capacity];
        size = 0;
   }
    /**
     * 默认的构造方法，初始容量为10
     */
   public Array(){
        this(10);
   }
   // 获取数组元素个数
   public int getSize(){
       return size;
   }

   //获取数组容量大小
    public int getCapacity(){
       return data.length;
    }

    //返回数组是否为空
    public boolean isEmpty(){
       return size == 0;
    }

    //向数组最后添加一个元素
    public void addLast(int e){
       add(size,e);
    }
    //向数组最前面添加一个元素
    public void addFirst(int e){
       add(0,e);
    }

    /**
     * 向数组指定位置添加元素
     * @param index 位置
     * @param e 要添加的元素
     */
    public void add(int index, int e){
        if(size == data.length){
            throw new IllegalArgumentException("Add failed. Array is full.");
        }
        if(index < 0 || index > size){
            throw new IllegalArgumentException("Add failed. Require index must between 0 and size");
        }
        for(int i =size -1;i>=index;i--){
            data[i+1] = data[i];
        }
        data[index] = e;
        size ++;
    }
    //獲取index位置的元素
    public int get(int index){
        if(index<0||index>size){
            throw new IllegalArgumentException("Get failed. Index is illegal");
        }
        return data[index];
    }
    //更新index位置的元素為e
    public void set(int index,int e){
        if(index<0||index>size){
            throw new IllegalArgumentException("Set failed. Index is illegal");
        }
        data[index] = e;
    }
    // 查找數組中是否包含元素e
    public boolean contains(int e){
        for(int i=0;i<size;i++){
            if(e==data[i]){
                return true;
            }
        }
        return false;
    }

    // 查找元素并返回該元素的索引，不存在返回-1
    public int find(int e){
        for(int i=0;i<size;i++){
            if(e==data[i]){
                return i;
            }
        }
        return -1;
    }
    //从数组中删除index位置的元素并返回该元素
    public int remove(int index){
        if(index<0||index>=size){
            throw new IllegalArgumentException("Remove failed. Index is illegal");
        }
        int ret = data[index];
        for(int i = index+1;i<size;i++){
            data[i-1] = data[i];
        }
        size --;
        return ret;
    }
    //删除第一个元素并返回它
    public int removeFirst(){
        return remove(0);
    }
    // 删除最后一个元素并返回它
    public int removeLast(){
        return remove(size-1);
    }
    // 删除指定元素，重复元素至会删除首个
    public void removeElement(int e){
        int index = find(e);
        if(index!=-1){
            remove(index);
        }


    }

    @Override
    public String toString(){
        StringBuilder res = new StringBuilder();
        res.append(String.format("Array: size=%d,capacity=%d\n",size,data.length));
        res.append("[");
        for(int i=0;i<size;i++){
            res.append(data[i]);
            if(i !=size-1){
                res.append(",");
            }
        }
        res.append("]");
        return res.toString();
    }
}
