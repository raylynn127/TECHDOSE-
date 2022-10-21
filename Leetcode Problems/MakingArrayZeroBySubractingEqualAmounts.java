Set<Integer> hset = new HashSet<>();
        
        for(int n : nums) {
			//Ignore 0.
            if(n == 0)
            continue;
            
			//insert all non-zero elements to set.
            hset.add(n);
        }
        
		//Return size of set. which holds the unique elements.
        return hset.size();
    }